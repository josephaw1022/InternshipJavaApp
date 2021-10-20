import java.util.ArrayList;

public class EndpointJob {

  private ArrayList<JobListing> list;

  public void create(Job jobn ){
      this.list.add(job)

    }

  /**
   * @return Job
   */
  public JobListing readDetail(int id) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list[i] == id) {
        return this.list[i];
      }
    }
  }

  /** 
     * @return Job[]
     */
    public JobListing[] readList() {
      return this.list 
    }

  public void update(Job job){ 
      for (int i = 0; i < this.list.size(); i++) {
        if (this.list[i] == job.id) {
          this.list[i] = job 
        }
      } 
    }

  public void delete(int id){
      or (int i = 0; i < this.list.size(); i++) {
        if (this.list[i] == job.id) {
          this.list.remove(i);
        }
      }
    }

}