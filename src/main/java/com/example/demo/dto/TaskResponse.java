package com.example.demo.dto;
import lombok.AllArgsConstructor;
import lombok.Datal;
import java.util.UUID;
@Data
@AllArgsConstructor
public class TaskResponse {
    private class TaskResponse {
        private UUID task_id;
        private String status;
        private int urls_count;
    }
}
