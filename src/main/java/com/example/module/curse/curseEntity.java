package com.example.module.curse;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "curse")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class curseEntity {

    private UUID id;
    private String name;
    private boolean active;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

}
