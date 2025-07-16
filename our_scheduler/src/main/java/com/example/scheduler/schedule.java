package com.example.scheduler;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class schedule {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false, updatable = false)
    private String scheduleUuid = UUID.randomUUID().toString(); // 랜덤 UUID

    @ManyToOne
    private User user;

    private String title;
    private String description;

    @Lob
    private String scheduleData; // 168칸 0/1문자열 (일정 있을 시 1, 없을 시 0)
    private boolean isPublic = true;
    private boolean isDefault = false;
}
