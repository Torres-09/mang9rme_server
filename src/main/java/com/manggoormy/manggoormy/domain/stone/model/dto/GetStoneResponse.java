package com.manggoormy.manggoormy.domain.stone.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GetStoneResponse {
    private Long stoneId;
    private String stoneName;
    private String dateTime;
    private String address;
    private String imageUrl;
    private String rarity;
}
