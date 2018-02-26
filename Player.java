public class Player{
    public String name;
    public PlayerRoles role;
    public PlayerClass playerClass;

    public Player(String name, PlayerClass pClass, PlayerRoles pRole){
        this.name = name;
        this.role = pRole;
        this.playerClass = pClass;
    }
}
