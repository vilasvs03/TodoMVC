package com.assignment.model.response;

import lombok.*;

@Getter @Setter @Builder
@NoArgsConstructor
@AllArgsConstructor
public class MerchantResponse
{
    private Control control;
    private Data data;
}