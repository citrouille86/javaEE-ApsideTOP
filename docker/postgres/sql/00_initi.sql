-- drop schema public;

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

CREATE SCHEMA "data";
GRANT ALL ON SCHEMA data TO admin;
SET search_path = "data", pg_catalog;
alter user admin SET search_path = "data", pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

commit;