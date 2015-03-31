/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db.facades;

import db.abstr.facades.IAbstractFacade;
import db.entities.User;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author okalman
 */
public interface IUserFacade extends IAbstractFacade<User>{

    boolean existsUser(String login);

    User getUserByLogin(String login);
    
}
