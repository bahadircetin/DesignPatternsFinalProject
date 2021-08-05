# DesignPatternsFinalProject

## Project Class Diagram

## Project Design Description

In our project, we designed a combat simulator we have 3 different soldier types which are
knight, archer, bomber. Also, we have a commander for these soldiers. We used an adapter
for the Commander Class in order to adapt its behavior (giving orders) to attack behavior. We
use decorator to count number of attacks so we can count the each soldier’s attack behavior.
We used Abstract Factory to create soldiers with the different functionality. We used
composite pattern to create armies for the battle and of course inside the armies we can have
units which are consist of one type of soldier. For example, Knights Unit, Archers Unit so we
can put different kinds of units into one army. By doing this, we can create tree shaped
structures with the composite pattern commander at the top and the units are under his control
may be. Iterator pattern is used in the composite pattern for iterate through the composite
which is army in our case and also for the observers list. We used observer to get information
when any soldier is attacked. So, our combatStrategist can make analysis with this
information. Finally, we used state pattern in order to change our castle’s state so we can
show different kind of behaviors for different states. In our case, when the castle is attack
state, soldiers will attack to enemy. However, if it’s in the pending state all soldiers will wait
for the orders inside the castle. 
