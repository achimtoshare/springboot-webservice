package com.hkhexbook.springboot.web.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass //JPA Entity클래스들의 BaseTimeEntity를 상속할 경우 필드들도 칼럼으로 인식하도록 한다.
@EntityListeners(AuditingEntityListener.class) // Auditing기능을 포함시킨다.
public abstract class BaseTimeEntity { //모든 Entity의 상위 클래스가 되어 Entity들의 createDate, modifiedDate를 자동으로 관리하는 역할.

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;

}
