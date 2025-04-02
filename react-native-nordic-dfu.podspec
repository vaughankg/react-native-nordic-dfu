# frozen_string_literal: true

require 'json'

package = JSON.parse(File.read(File.join(__dir__, 'package.json')))

Pod::Spec.new do |s|
  s.name         = 'react-native-nordic-dfu'
  s.version      = package['version']
  s.summary      = package['description']

  s.authors      = { 'Pilloxa' => 'recruitment@pilloxa.com' }
  s.homepage     = 'https://github.com/Pilloxa/react-native-nordic-dfu'
  s.license      = 'Apache License 2.0'
  s.platform     = :ios, '16.0'

  s.source       = { git: package['url'] + '.git' }
  s.source_files = 'ios/**/*.{h,m}'

  s.dependency 'React-Core'
  s.dependency 'iOSDFULibrary', '~> 4.14.0'
end
