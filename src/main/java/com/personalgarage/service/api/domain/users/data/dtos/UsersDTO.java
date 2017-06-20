package com.personalgarage.service.api.domain.users.data.dtos;

import com.personalgarage.service.api.domain.users.data.constants.UserStateConst;
import com.personalgarage.service.api.domain.users.data.constants.UserTypeConst;
import com.personalgarage.service.base.data.dto.BaseDTO;
import com.personalgarage.service.common.validation.groups.ActionInsert;
import com.personalgarage.service.common.validation.groups.ActionUpdate;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UsersDTO extends BaseDTO {

    @NotBlank(message = "Username cannot be blank", groups = { ActionInsert.class, ActionUpdate.class })
    private String username;

    @NotNull(message = "UsersStates cannot be null", groups = { ActionInsert.class, ActionUpdate.class })
    private UserStateConst usersStates;

    @NotNull(message = "UsersTypes cannot be null", groups = { ActionInsert.class, ActionUpdate.class })
    private UserTypeConst usersTypes;

//    @NotNull(message = "UsersSettings cannot be null", groups = { ActionInsert.class, ActionUpdate.class })
//    private List<UsersSettings> usersSettings;
}