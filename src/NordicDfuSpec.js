/**
 * @flow
 */
import type { TurboModule } from 'react-native/Libraries/TurboModule/RCTExport';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
  // iOS implementation
  startDFU(
    deviceAddress: string,
    deviceName: ?string,
    filePath: string,
    packetReceiptNotificationParameter: number,
    alternativeAdvertisingNameEnabled: boolean
  ): Promise<string>;

  // Android implementation
  startDFU(
    deviceAddress: string,
    deviceName: ?string,
    filePath: string,
    packetReceiptNotificationParameter: number,
    options: {
      retries: number,
      maxMtu: number,
    }
  ): Promise<string>;
}

export default (TurboModuleRegistry.getEnforcing<Spec>(
  'RNNordicDfu'
): Spec); 