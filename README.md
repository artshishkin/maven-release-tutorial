[![CircleCI](https://circleci.com/gh/artshishkin/maven-release-tutorial.svg?style=svg)](https://circleci.com/gh/artshishkin/maven-release-tutorial)

#16 Maven Release Plugin Tutorial

##160-161 Maven SCM Configuration
- add `maven-release-plugin`
- configure `scm`
- configure `setting.xml` to connect to `server` github
- set property `<project.scm.id>` to `git` - server id from `settings.xml`

##162 Maven Release Prepare and Perform
- `mvn clean release:prepare`
- `mvn release:perform`

##163 Maven Release Rollback
- `mvn clean release:prepare`
- `mvn release:rollback`
- delete Tag with  Atlassian Sourcetree

##164 Maven Release Example Error
- added dependency to `SNAPSHOT` version
- `mvn clean release:prepare`
- Got an error: 
```Can't release project due to non released dependencies :...SNAPSHOT```
- `mvn release:clean` (because we hot release.properties)

##165 Maven Release Dry Run
- `mvn clean release:prepare -DdryRun`
- check everything is correct
- `mvn release:clean`

##166 CircleCI Configuration

##167 CircleCI Deploy to PackageCloud
- added environment variable `PCLOUD` to CircleCI (PackageCloud API Token)
- created `settings.xml` with settings to deploy to PackageCloud `server`

##168 CircleCI Release to PackageCloud
- `--batch-mode` - use default value when running `mvn` command (i.e. `release:prepare`) 
- need to set up `git` account credentials 
- was `infinite loop` of releases, need to use `[ci skip]`
- `<scmCommentPrefix>[maven-release-plugin] [skip ci]</scmCommentPrefix>`

- fake commit to test -skip ci
