diff --git a/hibernate-core/src/test/java/org/hibernate/test/insertordering/InsertOrderingWithBidirectionalOneToManyFlushProblem.java b/hibernate-core/src/test/java/org/hibernate/test/insertordering/InsertOrderingWithBidirectionalOneToManyFlushProblem.java
index b9640d6..968596d 100644
--- a/hibernate-core/src/test/java/org/hibernate/test/insertordering/InsertOrderingWithBidirectionalOneToManyFlushProblem.java
+++ b/hibernate-core/src/test/java/org/hibernate/test/insertordering/InsertOrderingWithBidirectionalOneToManyFlushProblem.java
@@ -36,7 +36,7 @@
 		doInHibernate(
 			this::sessionFactory,
 			session -> {
-				Top top1 = new Top();
+				TopEntity top1 = new TopEntity();
 
 				session.persist( top1 );
 
@@ -46,19 +46,19 @@
 				// output: [top1]
 				session.flush();
 
-				Middle middle1 = new Middle();
+				MiddleEntity middle1 = new MiddleEntity();
 
-				middle1.addBottom( new Bottom() );
+				middle1.addBottom( new BottomEntity() );
 				top1.addMiddle( middle1 );
 				session.persist( middle1 );
 
-				Top top2 = new Top();
+				TopEntity top2 = new TopEntity();
 
 				session.persist( top2 );
 
-				Middle middle2 = new Middle();
+				MiddleEntity middle2 = new MiddleEntity();
 
-				middle2.addBottom( new Bottom() );
+				middle2.addBottom( new BottomEntity() );
 				top2.addMiddle( middle2 );
 				session.persist( middle2 );
 
@@ -83,11 +83,11 @@
 
 	@Override
 	protected Class[] getAnnotatedClasses() {
-		return new Class[] { Top.class, Middle.class, Bottom.class };
+		return new Class[] { TopEntity.class, MiddleEntity.class, BottomEntity.class };
 	}
 
-	@Entity(name = "Bottom")
-	public static class Bottom {
+	@Entity(name = "BottomEntity")
+	public static class BottomEntity {
 
 		@Column(nullable = false)
 		@GeneratedValue(
@@ -102,11 +102,11 @@
 		private Long id;
 
 		@ManyToOne(optional = false)
-		private Middle middle;
+		private MiddleEntity middle;
 	}
 
-	@Entity(name = "Middle")
-	public static class Middle {
+	@Entity(name = "MiddleEntity")
+	public static class MiddleEntity {
 
 		@Column(nullable = false)
 		@GeneratedValue(
@@ -121,22 +121,22 @@
 		private Long id;
 
 		@ManyToOne(optional = false)
-		private Top top;
+		private TopEntity top;
 
 		@OneToMany(
 				cascade = PERSIST,
 				mappedBy = "middle"
 		)
-		private List<Bottom> bottoms = new ArrayList<>();
+		private List<BottomEntity> bottoms = new ArrayList<>();
 
-		private void addBottom(Bottom bottom) {
+		private void addBottom(BottomEntity bottom) {
 			bottoms.add( bottom );
 			bottom.middle = this;
 		}
 	}
 
-	@Entity(name = "Top")
-	public static class Top {
+	@Entity(name = "TopEntity")
+	public static class TopEntity {
 
 		@Column(nullable = false)
 		@GeneratedValue(
@@ -151,9 +151,9 @@
 		private Long id;
 
 		@OneToMany(mappedBy = "top")
-		private List<Middle> middles = new ArrayList<>();
+		private List<MiddleEntity> middles = new ArrayList<>();
 
-		void addMiddle(Middle middle) {
+		void addMiddle(MiddleEntity middle) {
 			middles.add( middle );
 			middle.top = this;
 		}
