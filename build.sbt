
val cucumberVersion = "7.29.0"

libraryDependencies ++= Seq(
  "io.cucumber" % "cucumber-core" % cucumberVersion
)

// Trying without version reference

libraryDependencies ++= Seq(
  "io.cucumber" % "cucumber-junit" % "7.29.0"
)
