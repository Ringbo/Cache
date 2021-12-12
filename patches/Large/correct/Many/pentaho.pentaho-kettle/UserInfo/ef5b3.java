diff --git a/src/be/ibridge/kettle/repository/UserInfo.java b/src/be/ibridge/kettle/repository/UserInfo.java
index 905b348..2f2c49f 100644
--- a/src/be/ibridge/kettle/repository/UserInfo.java
+++ b/src/be/ibridge/kettle/repository/UserInfo.java
@@ -73,7 +73,7 @@
 				if (r!=null)
 				{
 					this.login  = r.searchValue("LOGIN").getString();
-					password    = Encr.decryptPasswordOptionallyEncrypted( r.searchValue("PASSWORD").getString() );
+					password    = Encr.decryptPassword( r.searchValue("PASSWORD").getString() );
 					name        = r.searchValue("NAME").getString();
 					description = r.searchValue("DESCRIPTION").getString();
 					enabled     = r.searchValue("ENABLED").getBoolean();
