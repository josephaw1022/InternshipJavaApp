import java.util.ArrayList;

public class EndpointJob {

  private ArrayList<JobListing> list;

  public static void create(Job jobn ){
      this.list.add(job)
    }

  /**
   * @return Job
   */
  public static JobListing readDetail(int id) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list[i].id == id) {
        return this.list[i];
      }
    }
  }

  /** 
     * @return Job[]
     */
    public static JobListing[] readList() {
      return this.list 
    }

  public static boolean update(Job job){ 
      for (int i = 0; i < this.list.size(); i++) {
        if (this.list[i].id == job.id) {
          this.list[i] = job 
        }
      } 
    }

  public static boolean delete(int id) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list[i].id == id) {
        this.list.remove(i);
      }
    }
  }

}