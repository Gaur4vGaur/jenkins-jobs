package ci_open_jenkins.build

import javaposse.jobdsl.dsl.DslFactory
import uk.gov.hmrc.jenkinsjobbuilders.domain.builder.BuildMonitorViewBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtFrontendJobBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtLibraryJobBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtScalaJsLibraryJobBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtMicroserviceJobBuilder

new SbtMicroserviceJobBuilder('customer-profile').build(this as DslFactory)

new SbtMicroserviceJobBuilder('personal-income').build(this as DslFactory)

new SbtMicroserviceJobBuilder('personal-tax-summary').build(this as DslFactory)

new SbtMicroserviceJobBuilder('push-notification-scheduler').build(this as DslFactory)

new SbtMicroserviceJobBuilder('mobile-messages').build(this as DslFactory)

new SbtMicroserviceJobBuilder('submission-tracker').build(this as DslFactory)

new SbtMicroserviceJobBuilder('push-notification').build(this as DslFactory)

new SbtMicroserviceJobBuilder('push-registration').build(this as DslFactory)

new SbtMicroserviceJobBuilder('native-apps-api-orchestration').build(this as DslFactory)

new SbtMicroserviceJobBuilder('open-app-orchestrator').build(this as DslFactory)

new SbtMicroserviceJobBuilder('api-gateway-async-example').build(this as DslFactory)

new SbtFrontendJobBuilder('your-tax-calculator-frontend').build(this as DslFactory)

new SbtFrontendJobBuilder('mobile-token-proxy').build(this as DslFactory)

new SbtMicroserviceJobBuilder('mobile-token-exchange').build(this as DslFactory)

new SbtLibraryJobBuilder('play-hmrc-api').build(this)

new SbtLibraryJobBuilder('play-hal').build(this)

new SbtLibraryJobBuilder('play-async').build(this as DslFactory)

new SbtLibraryJobBuilder('microservice-async').build(this as DslFactory)

new SbtScalaJsLibraryJobBuilder('paye-estimator').withoutJUnitReports().build(this)

new SbtMicroserviceJobBuilder('authenticate-one-time-password').build(this as DslFactory)

new SbtFrontendJobBuilder('managing-vat-debt-frontend').build(this as DslFactory)

new SbtMicroserviceJobBuilder('sns-client').build(this as DslFactory)

new SbtMicroserviceJobBuilder('aws-sns-stub').build(this as DslFactory)

new SbtMicroserviceJobBuilder('async-message-broker').build(this as DslFactory)

new BuildMonitorViewBuilder('NGC-MONITOR')
		.withJobs('personal-income',
		'personal-tax-summary',
		'customer-profile',
		'mobile-messages',
		'push-notification',
		'push-registration',
		'submission-tracker',
		'native-apps-api-orchestration',
		'open-app-orchestrator',
		'api-gateway-async-example',
		'play-hmrc-api',
		'play-async',
		'microservice-async',
		'play-hal',
		'mobile-token-exchange',
		'mobile-token-proxy',
		'your-tax-calculator-frontend',
		'paye-estimator',
		'authenticate-one-time-password',
		'managing-vat-debt-frontend',
		'sns-client',
		'aws-sns-stub',
                'async-message-broker').build(this)


