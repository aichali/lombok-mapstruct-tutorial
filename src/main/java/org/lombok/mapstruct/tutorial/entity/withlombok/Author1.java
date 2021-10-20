package org.lombok.mapstruct.tutorial.entity.withlombok;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
public class Author1 implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    String name;
    String email;
    char gender;
}