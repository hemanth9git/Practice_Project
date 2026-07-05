package com.hemanthit.practice_project.model;

import lombok.Data;

import java.util.List;
@Data
public class OrderRequestDto {
    private int cid;
    private List<Orders> orders;
}
