class Pair
{
    int time;
    String value;
    Pair(int time,String value)
    {
        this.time=time;
        this.value=value;
    }
}
class TimeMap {
    HashMap<String, List<Pair>> map = new HashMap<>();
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key))
        {
            List<Pair> temp = map.get(key);
            temp.add(new Pair(timestamp,value));
        }
        else
        {
            List<Pair> temp = new ArrayList<>();
            temp.add(new Pair(timestamp,value));
            map.put(key,temp);
        }
        // map.forEach((keys, values) -> {
        //     System.out.print(key+" ");
        //     for(Pair x:values)
        //     {
        //         System.out.print( " "+ x.time+"  "+ x.value);
        //     }
        //     System.out.println();
        // });
    }
    
    public String get(String key, int timestamp) {
        List<Pair> temp = map.get(key);
        if(temp==null||temp.size()==0)
        {
            return "";
        }
        String value = binarySearch(temp,timestamp);
        return value;
    }
   public String binarySearch(List<Pair> temp, int timestamp) {
        int start = 0;
        int end = temp.size() - 1;
        int mid = 0;
        String value = "";

        while (start <= end) { // Change while condition to handle edge cases
            mid = start + (end - start) / 2;
            Pair curr = temp.get(mid);

            if (curr.time == timestamp) {
                return curr.value;
            } else if (curr.time > timestamp) {
                end = mid - 1;
            } else {
                value = curr.value; // Update value for the largest timestamp_prev
                start = mid + 1;
            }
        }

    return value;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */