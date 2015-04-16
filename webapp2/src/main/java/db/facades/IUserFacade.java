/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db.facades;

import db.abstr.facades.IAbstractFacade;
import db.entities.User;
import global.types.Login;
import global.types.Password;
import javax.ejb.Local;

/**
 *
 * @author okalman
 */
@Local
public interface IUserFacade extends IAbstractFacade<User>{

    boolean existsUser(Login login);
    User getUserByLoginAndPassword(Login login, Password password);
}
