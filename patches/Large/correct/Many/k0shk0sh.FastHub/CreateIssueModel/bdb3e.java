diff --git a/app/src/main/java/com/fastaccess/data/dao/CreateIssueModel.java b/app/src/main/java/com/fastaccess/data/dao/CreateIssueModel.java
index c842add..35d1659 100644
--- a/app/src/main/java/com/fastaccess/data/dao/CreateIssueModel.java
+++ b/app/src/main/java/com/fastaccess/data/dao/CreateIssueModel.java
@@ -28,7 +28,7 @@
         dest.writeString(this.body);
         dest.writeStringList(this.labels);
         dest.writeStringList(this.assignees);
-        dest.writeLong(this.milestone);
+        dest.writeValue(this.milestone);
     }
 
     protected CreateIssueModel(Parcel in) {
@@ -36,7 +36,7 @@
         this.body = in.readString();
         this.labels = in.createStringArrayList();
         this.assignees = in.createStringArrayList();
-        this.milestone = in.readLong();
+        this.milestone = (Long) in.readValue(Long.class.getClassLoader());
     }
 
     public static final Creator<CreateIssueModel> CREATOR = new Creator<CreateIssueModel>() {
