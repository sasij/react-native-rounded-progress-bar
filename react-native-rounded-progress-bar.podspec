require "json"

package = JSON.parse(File.read(File.join(__dir__, "package.json")))

Pod::Spec.new do |s|
  s.name         = "react-native-rounded-progress-bar"
  s.version      = package["version"]
  s.summary      = package["description"]
  s.description  = <<-DESC
                  react-native-rounded-progress-bar
                   DESC
  s.homepage     = "https://github.com/sasij/react-native-rounded-progress-bar"
  s.license      = "MIT"
  s.license    = { :type => "MIT", :file => "FILE_LICENSE" }
  s.authors      = { "Alejo Castaño" => "alejandro.castano@domestika.org" }
  s.platforms    = { :ios => "9.0" }
  s.source       = { :git => "https://github.com/sasij/react-native-rounded-progress-bar.git", :tag => "#{s.version}" }

  s.source_files = "ios/**/*.{h,m,swift}"
  s.requires_arc = true

  s.dependency "React"
  # ...
  # s.dependency "..."
end

