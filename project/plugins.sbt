logLevel := Level.Warn

resolvers += "Sonatype OSS Releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2"

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")
addSbtPlugin("de.heikoseeberger" % "sbt-header" % "1.5.1-20-g278a127")
