package org.tf.web.controllers;

import net.paoding.rose.web.annotation.Param;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Post;
import org.tf.web.ServerConstants;

/**
 * @author hezhiyu on 15/1/11.
 */
@Path("user")
public class UserController {


    @Post("login")
    public String login(@Param("username") String username,
                        @Param("password") String password) {

        return ServerConstants.RESP_JSON_PREFIX;
    }
}
