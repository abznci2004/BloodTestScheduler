/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodTestScheduler;

import java.util.LinkedList;

public class NoShowStack {
    private LinkedList<String> noShows = new LinkedList<>();

    public void addNoShow(String name) {
        if (noShows.size() >= 5) noShows.removeFirst();
        noShows.add(name);
    }

    public LinkedList<String> getNoShows() { 
        return new LinkedList<>(noShows); 
    }
}