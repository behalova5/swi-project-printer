/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db.facades;

import db.abstr.facades.IAbstractFacade;
import db.entities.User;
import global.types.Login;

/**
 *
 * @author okalman
 */
public interface IUserFacade extends IAbstractFacade<User>{

    boolean existsUser(Login login);

    User getUserByLogin(Login login);
    
}
