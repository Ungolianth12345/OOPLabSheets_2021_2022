package labsheet5.exercise3;

public class Thermometer {
    private int currTemp;
    private int maxTemp;
    private int minTemp;

    public int getCurrTemp() {
        return currTemp;
    }

    public void setCurrTemp(int currTemp) {
        this.currTemp = currTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public String toString(){
        return "Current temperature: " + getCurrTemp() + "\nMax temperature:" +
                getMaxTemp() + "\nMin temperature: " + getMinTemp();
    }

    public void setTemperature(int currTemp){
        setCurrTemp(currTemp);
        updateMaxMinTemp();
    }

    private void updateMaxMinTemp(){
        if (getCurrTemp() > getMaxTemp()){
            setMaxTemp(getCurrTemp());
        }

        if (getCurrTemp() < getMinTemp()) {
            setMinTemp(getCurrTemp());
        }
    }

    public Thermometer() {
        setCurrTemp(0);
        setMaxTemp(Integer.MIN_VALUE);
        setMinTemp(Integer.MAX_VALUE);
    }

    public Thermometer(int currTemp) {
        setCurrTemp(currTemp);
        setMaxTemp(currTemp);
        setMinTemp(currTemp);
    }
}
