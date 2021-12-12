diff --git a/junit/swingui/DefaultFailureDetailView.java b/junit/swingui/DefaultFailureDetailView.java
index e676b95..51e79c7 100644
--- a/junit/swingui/DefaultFailureDetailView.java
+++ b/junit/swingui/DefaultFailureDetailView.java
@@ -48,7 +48,7 @@
 			fLines.removeAllElements();
      		StringTokenizer st= new StringTokenizer(trace, "\n\r", false);
 	    	while (st.hasMoreTokens()) 
- 				fLines.add(st.nextToken());
+ 				fLines.addElement(st.nextToken());
 		}
 	}
 	
