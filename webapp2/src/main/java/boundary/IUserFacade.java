/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boundary;

import entities.User;

/**
 *
 * @author okalman
 */
public interface IUserFacade {

    boolean existsUser(String login);

    User getUserByLogin(String login);
    
}
