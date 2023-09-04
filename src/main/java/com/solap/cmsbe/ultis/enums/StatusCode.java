package com.solap.cmsbe.ultis.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public enum StatusCode {
    SUCCESS("200"),
    FAILED("400");

    private String value;

}
