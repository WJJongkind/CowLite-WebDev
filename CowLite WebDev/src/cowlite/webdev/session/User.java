package cowlite.webdev.session;

/**
 * Objects of this class represent the different users of the application. This
 * class is used for authentication and validation of users/clients.
 * @author Wessel Jongkind
 * @version 02-09-2017
 */
public final class User
{
    private String name;
    
    /**
     * The hash of the password associated with the user/account
     */
    private String hash;
    
    /**
     * The salt used to generate the hash associated with the user/account
     */
    private String salt;
    
    /**
     * Sets the hash of the password associated with the user's account.
     * @param hash The hash of the password associated with the user's account.
     */
    public void setHash(String hash)
    {
        this.hash = hash;
    }
    
    /**
     * Sets the salt used to hash the user's password.
     * @param salt The salt used to hash the user's password.
     */
    public void setSalt(String salt)
    {
        this.salt = salt;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Returns the hash generated from the user's password.
     * @return The hash generated from the user's password.
     */
    public String getHash() {
        return hash;
    }
    
    /**
     * Returns the salt used to hash the user's password.
     * @return The salt used to hash the user's password.
     */
    public String getSalt() {
        return salt;
    }
}
