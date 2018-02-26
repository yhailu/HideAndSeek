import java.util.List;

interface HideAndGoSeek {
    public void addPlayer(String name, PlayerClass playerClass, PlayerRoles playerRoles);
    public void startTurn(int turn, List<String> seekers, List<String> hiders);
    public void endTurn(int turn, List<String> seekers, List<String> hiders);
}
