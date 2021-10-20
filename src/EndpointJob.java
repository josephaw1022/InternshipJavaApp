import java.util.ArrayList;

public class EndpointJob {

  private ArrayList<JobListing> list;
  
  public void create(JobListing job){
      this.list.add(job);
    }

  /**
   * @return Job
   */
  public JobListing readDetail(String id) {
    for (int i = 0; i < this.list.size(); i++) {
      if(this.list.get(i).id == id) {
        return this.list.get(i);
      }
    }
    return new JobListing();
  }

  /** 
     * @return Job[]
     */
    public ArrayList<JobListing> readList() {
      return this.list;
    }

  public void update(JobListing job){ 
      for (int i = 0; i < this.list.size(); i++) {
        if (this.list.get(i).id == job.id) {
          job = this.list.get(i);
        }
      } 
    }

  public void delete(String id){
      for (int i = 0; i < this.list.size(); i++) {
        if (this.list.get(i).id == id) {
          this.list.remove(i);
        }
      }
    }

}