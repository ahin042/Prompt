package com.axhn.prompt.domain.prompt.dto.request;

public record PromptRequest (
    String purpose,      // 목적
    String context,      // 맥락
    String format,       // 형식
    String constraints   // 제약조건
) {}