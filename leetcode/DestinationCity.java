package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**

    You are given the array paths, where paths[i] = [cityAi, cityBi] 
    means there exists a direct path going from cityAi to cityBi. 
    Return the destination city, that is, the city without any path outgoing to another city.

    It is guaranteed that the graph of paths forms a line without any loop, therefore, 
    there will be exactly one destination city.

    
    Example 1:

    Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
    Output: "Sao Paulo"

 */

public class DestinationCity {
    
    // Time: O(n)
    // destination city using map
    public static String destinationCity (List<List<String>> paths) {
        // init destination to ""
        String destination = "";
        // init map of string, string
        Map<String, String> map = new HashMap<>();

        // for each path in paths
        for (List<String> path :paths) {
            // in map put path get 0, path get 1
            map.put(path.get(0), path.get(1));
        }

        // for each path in paths
        for (List<String> path : paths) {
            // if map doesn't contain key path get 1
            if (!map.containsKey(path.get(1))) {
                // set destination to path get 1
                destination = path.get(1);
                // break
                break;
            }

        }

        // return destination
        return destination;
    }


    // main
    public static void main(String[] args) {
        List<List<String>> paths = List.of(
                                        List.of("London","New York"),
                                        List.of("New York","Lima"),
                                        List.of("Lima","Sao Paulo")
                                    );
        System.out.println(destinationCity(paths));
    }
}
