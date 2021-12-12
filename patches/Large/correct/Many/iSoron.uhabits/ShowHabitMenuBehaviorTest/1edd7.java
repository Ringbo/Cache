diff --git a/uhabits-core/src/test/java/org/isoron/uhabits/core/ui/screens/habits/show/ShowHabitMenuBehaviorTest.java b/uhabits-core/src/test/java/org/isoron/uhabits/core/ui/screens/habits/show/ShowHabitMenuBehaviorTest.java
index 08aa1a7..fefade2 100644
--- a/uhabits-core/src/test/java/org/isoron/uhabits/core/ui/screens/habits/show/ShowHabitMenuBehaviorTest.java
+++ b/uhabits-core/src/test/java/org/isoron/uhabits/core/ui/screens/habits/show/ShowHabitMenuBehaviorTest.java
@@ -50,7 +50,7 @@
 
         habit = fixtures.createShortHabit();
         menu = new ShowHabitMenuBehavior(habitList, habit, taskRunner, screen,
-            system);
+            system, commandRunner);
     }
 
     @Test
