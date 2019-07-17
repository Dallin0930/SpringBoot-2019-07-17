package com.tw.apistackbase.controller;

import com.tw.apistackbase.Company;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.*;
import java.util.List;

public interface databaseInterface extends JpaRepository<Company,String> {








}
