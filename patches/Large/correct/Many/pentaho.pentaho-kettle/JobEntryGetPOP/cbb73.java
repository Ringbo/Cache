diff --git a/src/be/ibridge/kettle/job/entry/getpop/JobEntryGetPOP.java b/src/be/ibridge/kettle/job/entry/getpop/JobEntryGetPOP.java
index 547a9d6..17fb01f 100644
--- a/src/be/ibridge/kettle/job/entry/getpop/JobEntryGetPOP.java
+++ b/src/be/ibridge/kettle/job/entry/getpop/JobEntryGetPOP.java
@@ -354,8 +354,8 @@
 		prop.setProperty("mail.pop3.rsetbeforequit","true"); 
 		
 		//Create session object
-		//Session sess = Session.getDefaultInstance(prop,null);
-		Session sess = Session.getInstance(prop, null);
+		//Session sess = Session.getInstance(prop, null);
+		Session sess = Session.getDefaultInstance( prop, null );
 		sess.setDebug(true);
 
 		try
@@ -411,7 +411,8 @@
 		
 				log.logDetailed(toString(), Messages.getString("JobGetMailsFromPOP.LoggedWithUser.Label") + user);
 			
-				//Open default folder   INBOX 
+				//Open the INBOX FOLDER
+				// For POP3, the only folder available is the INBOX. 
 				Folder f = st.getFolder("INBOX");
 				
 					
@@ -529,9 +530,8 @@
 
 						}
 					}
-					// Close and exit
-
-					if(f != null) f.close(false);
+					//close the folder, passing in a true value to expunge the deleted message
+					if(f != null) f.close(true);
 					if (st != null) st.close();
 
 					f = null;
