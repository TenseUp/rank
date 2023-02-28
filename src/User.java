import java.lang.Math;
public class User {
    private int rank;
    private int progress;
    public User(){rank = -8;}
    public int getRank(){return rank;}
    public int getProgress(){return progress;}

    public void incProgress(int a){
        if ((a < -8) || (a==0) || (a > 8)){throw new IllegalArgumentException("The rank of an activity cannot be less than 8, 0, or greater than 8!");}
        int d;
        if (a<0){d = Math.abs(rank - a);}
        else{d = Math.abs(a - rank);}
        if ((rank < 0) && (a > 0)){d-=1;}
        if ((a + 2) == rank){d=-1;}

        if (a == rank){
            progress += 3;
        }
        else if (d==-1){
            progress += 1;
        }
        else{
            progress += 10 * d * d;
        }

        while (progress >= 100){
            if (rank == -1){
                rank+=2;
            } else {rank++;}
            progress-=100;
        }
    }

    public String toString(){return "User{" + "rank=" + rank + ", progress=" + progress + '}';}

}
