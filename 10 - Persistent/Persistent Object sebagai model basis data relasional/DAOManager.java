/*
 * Nama File  : DAOManager.java
 * Deskripsi  : pengelolda DAO dalam program
 * Pembuat    : Indra Purwanto (24060123140150)
 * Tanggal    : 14 mei 2025
*/
public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
