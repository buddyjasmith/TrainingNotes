DECLARE
    fname           employees.name%TYPE;
    sal             employees.salary%TYPE;
    eid             employees.employee_id%TYPE := &eid;
    invalid_eid     EXCEPTION;  --USER DEFINED EXCEPTION
BEGIN
    IF  eid <= 0   THEN
        RAISE invalid_eid;
    ELSE
        SELECT first_name, salary 
        INTO fname, sal
        FROM employees
        WHERE employee_id = eid;
        dbms_output.put_line( fname || ' ' || sal);
    END IF;

    EXCEPTION
      WHEN invalid_eid THEN
            dbms_output.put_line('LESS THAN 0!');
        WHEN NO_DATA_FOUND THEN
            dbms_output.put_line('no such record exists');      -- IF NOT FOUND
      
        WHEN OTHERS THEN    
            dbms_output.put_line('Error!');                 -- UNFORESEEN HANDLING1
END;
/
