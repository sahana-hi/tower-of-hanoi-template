
public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        solve(this.model.height(), 0, 1, 2);
        // Call the missing solve method (not this one)
    
    }

    

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //
    public void solve(int height, int source, int temp, int destination) {
        if (height == 1) {
            this.model.move(source, destination);
        } else {
            solve(height - 1, source, destination, temp);
            solve(1, source, temp, destination);
            solve(height - 1, temp, source, destination);
        }
    }

}
