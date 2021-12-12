diff --git a/src/be/ibridge/kettle/core/RowSet.java b/src/be/ibridge/kettle/core/RowSet.java
index 0466f9f..6f7f94e 100644
--- a/src/be/ibridge/kettle/core/RowSet.java
+++ b/src/be/ibridge/kettle/core/RowSet.java
@@ -181,6 +181,7 @@
 		thread_to   = to;
 	}
 	
+    /** @deprecated */
 	public boolean waitFrom()
 	{
 		try
@@ -195,6 +196,7 @@
 		return true;
 	}
 
+    /** @deprecated */
 	public boolean waitTo()
 	{
 		try
@@ -209,6 +211,7 @@
 		return true;
 	}
 
+    /** @deprecated */
 	public boolean notifyFrom()
 	{
 		if (!thread_from.waiting) return true;
@@ -223,6 +226,7 @@
 		return true;
 	}
 
+    /** @deprecated */
 	public boolean notifyTo()
 	{
 		if (!thread_to.waiting) return true;
@@ -237,7 +241,7 @@
 		return true;
 	}
 
-	public boolean setPriorityFrom(int prior)
+	public synchronized boolean setPriorityFrom(int prior)
 	{
 		if ( thread_from == null ||
 		     thread_from.getPriority()==prior ||
@@ -255,7 +259,7 @@
 		return true;
 	}
 
-	public boolean setPriorityTo(int prior)
+	public synchronized boolean setPriorityTo(int prior)
 	{
 		if ( thread_to == null ||
 			 thread_to.getPriority()==prior ||
@@ -273,11 +277,13 @@
 		return true;
 	}
 	
+    /** @deprecated */
 	public boolean waitingThreadFrom()
 	{
 		return thread_from.waiting;
 	}
 
+    /** @deprecated */
 	public boolean waitingThreadTo()
 	{
 		return thread_to.waiting;
