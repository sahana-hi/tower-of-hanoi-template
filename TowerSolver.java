
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
            // move recursively the disks excluding the bottom disk to temp/pole 1
            solve(height - 1, source, destination, temp);
            // move the last bottom large disk from the source to pole 2/destination/last pole
            solve(1, source, temp, destination);
            // move recursively the rest of the disks from temp/pole 1 to pole 2/last pole
            solve(height - 1, temp, source, destination);
        }
    }

}
