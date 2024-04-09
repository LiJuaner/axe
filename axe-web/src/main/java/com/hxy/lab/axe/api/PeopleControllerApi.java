package com.hxy.lab.axe.api;

import com.hxy.lab.axe.model.entity.People;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

/**
 * @Title: PeopleControllerApi
 * @Desription: (描述此类的功能)
 * @author: lijuan.li
 * @date: 2024/4/8 5:22 PM
 */
@Tag(name = "PeopleControllerApi", description = "用户相关接口")
public interface PeopleControllerApi {


    @Operation(summary = "获取用户信息", description = "获取所有用户信息")
    @ApiResponse(description = "返回所有用户信息", content = @Content(mediaType = "application/json", schema = @Schema(implementation = People.class)))
    List<People> getAll();

    @Operation(summary = "获取用户信息",
            description = "获取所有用户信息",
            parameters = {
                    @Parameter(name = "name", description = "姓名"),
                    @Parameter(name = "sex", description = "性别"),
                    @Parameter(name = "birth", description = "生日"),
                    @Parameter(name = "province", description = "籍贯")
            },
            responses = {
                    @ApiResponse(description = "返回添加的用户信息", content = @Content(mediaType = "application/json", schema = @Schema(anyOf = {People.class}))),
                    @ApiResponse(responseCode = "400", description = "返回400时错误的原因")
            }
    )
    People addPeople(String name, String sex, String birth, String province);

}
