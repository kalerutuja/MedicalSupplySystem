/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rutuja
 */
public class WorkQueue 
{
    private List<WorkRequest> workRequestList;
    
    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public List<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}
