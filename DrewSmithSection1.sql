set serveroutput on;


DECLARE
    employee_id     E.employee_id%TYPE;
    name            E.name%TYPE;
    gender          E.gender%TYPE;
    designation     E.designation%TYPE;

BEGIN
    SELECT E.employee_id, E.name, E.gender
    INTO employee_id, name, gender, designation
    FROM Employee E
    WHERE employee_id = E.employee_id

    dbms_output.put_line(employee_id || '-' || name );
    if gender = 'M' then
        dbms_output.put_line('He is the ' || designation);
    elsif gender = 'F' then
        dbms_output.put_line('She is the ' || designation);
    else        -- Just in case
        dbms_output.put_line('Other is the ' || designation);
END;
/

DECLARE
    c_id           C.customer_id%TYPE := '1001';
    c_first_name   C.first_name%TYPE;
    c_last_name    C.last_name%TYPE;
    c_home_phone   C.home_phone%TYPE;
    c_city         C.city%TYPE;
    c_state        C.state%TYPE;


BEGIN
    SELECT id, first_name, last_name, home_phone, city, state
    INTO  c_first_name, c_last_name, c_home_phone, c_city, c_state
    FROM customer_id
    where id = c_id;

    dbms_output.put_line('Customer ID: ' || id || CHR(10));
    dbms_output.put_line('Full Name: ' || c_first_name || ' ' || c_last_name || CHR(10));
    dbms_output.put_line('Home Phone: ' || c_home_phone || CHR(10));
    dbms_output.put_line('City: ' || c_city || CHR(10));
    dbms_output.put_line('State:' || c_state || CHR(10));

END;
/

-- Question 3
DECLARE
    location    Customer.location%TYPE := 'Mysore';
BEGIN
    UPDATE
    WHERE

    IF SQL%NOTFOUND then
    ELSE
END;
    
