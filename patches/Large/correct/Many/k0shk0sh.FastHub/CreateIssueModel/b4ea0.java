diff --git a/app/src/main/java/com/fastaccess/data/dao/CreateIssueModel.java b/app/src/main/java/com/fastaccess/data/dao/CreateIssueModel.java
index 97fddc8..aee571f 100644
--- a/app/src/main/java/com/fastaccess/data/dao/CreateIssueModel.java
+++ b/app/src/main/java/com/fastaccess/data/dao/CreateIssueModel.java
@@ -19,7 +19,7 @@
     private String body;
     private ArrayList<String> labels;
     private ArrayList<String> assignees;
-    private MilestoneModel milestone;
+    private long milestone;
 
     @Override public int describeContents() { return 0; }
 
@@ -28,7 +28,7 @@
         dest.writeString(this.body);
         dest.writeStringList(this.labels);
         dest.writeStringList(this.assignees);
-        dest.writeParcelable(this.milestone, flags);
+        dest.writeLong(this.milestone);
     }
 
     protected CreateIssueModel(Parcel in) {
@@ -36,7 +36,7 @@
         this.body = in.readString();
         this.labels = in.createStringArrayList();
         this.assignees = in.createStringArrayList();
-        this.milestone = in.readParcelable(MilestoneModel.class.getClassLoader());
+        this.milestone = in.readLong();
     }
 
     public static final Creator<CreateIssueModel> CREATOR = new Creator<CreateIssueModel>() {
