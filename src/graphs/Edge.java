/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author Tobias
 */
public interface Edge
{
    public Node getBeginNode();
    public Node getEndNode();
    public int getWeight();
}