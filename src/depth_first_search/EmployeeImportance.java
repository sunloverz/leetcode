package depth_first_search;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EmployeeImportance {
  class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
  }

  HashMap<Integer, Employee> map;
  public int getImportance(List<Employee> employees, int id) {
    map = new HashMap<>();
    for(Employee employee:employees)
      map.put(employee.id, employee);
    return dfs(employees, id);
  }

  public int dfs(List<Employee> employees, int id) {
    Employee employee = map.get(id);
    int ans = employee.importance;
    for(int subid:employee.subordinates) {
        ans += dfs(employees, subid);
    }
    return ans;
  }


  public int getImportance2(List<Employee> employees, int id) {
    HashMap<Integer, Employee> map = new HashMap<>();
    for(Employee employee:employees)
      map.put(employee.id, employee);

    Queue<Employee> queue = new LinkedList<>();
    queue.add(map.get(id));
    int count = 0;
    while(!queue.isEmpty()) {
      Employee employee = queue.poll();
      count += employee.importance;
      for(int subid:employee.subordinates) {
        queue.add(map.get(subid));
      }
    }
    return count;
  }

}
