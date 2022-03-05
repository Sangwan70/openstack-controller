[    0.000000] Initializing cgroup subsys cpuset
[    0.000000] Initializing cgroup subsys cpu
[    0.000000] Initializing cgroup subsys cpuacct
[    0.000000] Linux version 4.4.0-28-generic (buildd@lcy01-13) (gcc version 5.3.1 20160413 (Ubuntu 5.3.1-14ubuntu2.1) ) #47-Ubuntu SMP Fri Jun 24 10:09:13 UTC 2016 (Ubuntu 4.4.0-28.47-generic 4.4.13)
[    0.000000] Command line: LABEL=cirros-rootfs ro console=tty1 console=ttyS0
[    0.000000] KERNEL supported cpus:
[    0.000000]   Intel GenuineIntel
[    0.000000]   AMD AuthenticAMD
[    0.000000]   Centaur CentaurHauls
[    0.000000] x86/fpu: xstate_offset[3]:  960, xstate_sizes[3]:   64
[    0.000000] x86/fpu: xstate_offset[4]: 1024, xstate_sizes[4]:   64
[    0.000000] x86/fpu: Supporting XSAVE feature 0x01: 'x87 floating point registers'
[    0.000000] x86/fpu: Supporting XSAVE feature 0x02: 'SSE registers'
[    0.000000] x86/fpu: Supporting XSAVE feature 0x08: 'MPX bounds registers'
[    0.000000] x86/fpu: Supporting XSAVE feature 0x10: 'MPX CSR'
[    0.000000] x86/fpu: Enabled xstate features 0x1b, context size is 1088 bytes, using 'standard' format.
[    0.000000] x86/fpu: Using 'eager' FPU context switches.
[    0.000000] e820: BIOS-provided physical RAM map:
[    0.000000] BIOS-e820: [mem 0x0000000000000000-0x000000000009fbff] usable
[    0.000000] BIOS-e820: [mem 0x000000000009fc00-0x000000000009ffff] reserved
[    0.000000] BIOS-e820: [mem 0x00000000000f0000-0x00000000000fffff] reserved
[    0.000000] BIOS-e820: [mem 0x0000000000100000-0x0000000003fdafff] usable
[    0.000000] BIOS-e820: [mem 0x0000000003fdb000-0x0000000003ffffff] reserved
[    0.000000] BIOS-e820: [mem 0x00000000fffc0000-0x00000000ffffffff] reserved
[    0.000000] NX (Execute Disable) protection: active
[    0.000000] SMBIOS 2.8 present.
[    0.000000] e820: last_pfn = 0x3fdb max_arch_pfn = 0x400000000
[    0.000000] x86/PAT: Configuration [0-7]: WB  WC  UC- UC  WB  WC  UC- WT  
[    0.000000] found SMP MP-table at [mem 0x000f5c00-0x000f5c0f] mapped at [ffff8800000f5c00]
[    0.000000] Scanning 1 areas for low memory corruption
[    0.000000] Using GB pages for direct mapping
[    0.000000] RAMDISK: [mem 0x03b15000-0x03fcafff]
[    0.000000] ACPI: Early table checksum verification disabled
[    0.000000] ACPI: RSDP 0x00000000000F59E0 000014 (v00 BOCHS )
[    0.000000] ACPI: RSDT 0x0000000003FE1497 000030 (v01 BOCHS  BXPCRSDT 00000001 BXPC 00000001)
[    0.000000] ACPI: FACP 0x0000000003FE1383 000074 (v01 BOCHS  BXPCFACP 00000001 BXPC 00000001)
[    0.000000] ACPI: DSDT 0x0000000003FE0040 001343 (v01 BOCHS  BXPCDSDT 00000001 BXPC 00000001)
[    0.000000] ACPI: FACS 0x0000000003FE0000 000040
[    0.000000] ACPI: APIC 0x0000000003FE13F7 000078 (v01 BOCHS  BXPCAPIC 00000001 BXPC 00000001)
[    0.000000] ACPI: WAET 0x0000000003FE146F 000028 (v01 BOCHS  BXPCWAET 00000001 BXPC 00000001)
[    0.000000] No NUMA configuration found
[    0.000000] Faking a node at [mem 0x0000000000000000-0x0000000003fdafff]
[    0.000000] NODE_DATA(0) allocated [mem 0x03fd6000-0x03fdafff]
[    0.000000] Zone ranges:
[    0.000000]   DMA      [mem 0x0000000000001000-0x0000000000ffffff]
[    0.000000]   DMA32    [mem 0x0000000001000000-0x0000000003fdafff]
[    0.000000]   Normal   empty
[    0.000000]   Device   empty
[    0.000000] Movable zone start for each node
[    0.000000] Early memory node ranges
[    0.000000]   node   0: [mem 0x0000000000001000-0x000000000009efff]
[    0.000000]   node   0: [mem 0x0000000000100000-0x0000000003fdafff]
[    0.000000] Initmem setup node 0 [mem 0x0000000000001000-0x0000000003fdafff]
[    0.000000] ACPI: PM-Timer IO Port: 0x608
[    0.000000] ACPI: LAPIC_NMI (acpi_id[0xff] dfl dfl lint[0x1])
[    0.000000] IOAPIC[0]: apic_id 0, version 32, address 0xfec00000, GSI 0-23
[    0.000000] ACPI: INT_SRC_OVR (bus 0 bus_irq 0 global_irq 2 dfl dfl)
[    0.000000] ACPI: INT_SRC_OVR (bus 0 bus_irq 5 global_irq 5 high level)
[    0.000000] ACPI: INT_SRC_OVR (bus 0 bus_irq 9 global_irq 9 high level)
[    0.000000] ACPI: INT_SRC_OVR (bus 0 bus_irq 10 global_irq 10 high level)
[    0.000000] ACPI: INT_SRC_OVR (bus 0 bus_irq 11 global_irq 11 high level)
[    0.000000] Using ACPI (MADT) for SMP configuration information
[    0.000000] smpboot: Allowing 1 CPUs, 0 hotplug CPUs
[    0.000000] PM: Registered nosave memory: [mem 0x00000000-0x00000fff]
[    0.000000] PM: Registered nosave memory: [mem 0x0009f000-0x0009ffff]
[    0.000000] PM: Registered nosave memory: [mem 0x000a0000-0x000effff]
[    0.000000] PM: Registered nosave memory: [mem 0x000f0000-0x000fffff]
[    0.000000] e820: [mem 0x04000000-0xfffbffff] available for PCI devices
[    0.000000] Booting paravirtualized kernel on bare hardware
[    0.000000] clocksource: refined-jiffies: mask: 0xffffffff max_cycles: 0xffffffff, max_idle_ns: 7645519600211568 ns
[    0.000000] setup_percpu: NR_CPUS:256 nr_cpumask_bits:256 nr_cpu_ids:1 nr_node_ids:1
[    0.000000] PERCPU: Embedded 33 pages/cpu @ffff880003800000 s98008 r8192 d28968 u2097152
[    0.000000] Built 1 zonelists in Node order, mobility grouping on.  Total pages: 15972
[    0.000000] Policy zone: DMA32
[    0.000000] Kernel command line: LABEL=cirros-rootfs ro console=tty1 console=ttyS0
[    0.000000] PID hash table entries: 256 (order: -1, 2048 bytes)
[    0.000000] Memory: 39216K/64996K available (8368K kernel code, 1280K rwdata, 3928K rodata, 1480K init, 1292K bss, 25780K reserved, 0K cma-reserved)
[    0.000000] SLUB: HWalign=64, Order=0-3, MinObjects=0, CPUs=1, Nodes=1
[    0.000000] Hierarchical RCU implementation.
[    0.000000] 	Build-time adjustment of leaf fanout to 64.
[    0.000000] 	RCU restricting CPUs from NR_CPUS=256 to nr_cpu_ids=1.
[    0.000000] RCU: Adjusting geometry for rcu_fanout_leaf=64, nr_cpu_ids=1
[    0.000000] NR_IRQS:16640 nr_irqs:256 16
[    0.000000] Console: colour VGA+ 80x25
[    0.000000] console [tty1] enabled
[    0.000000] console [ttyS0] enabled
[    0.000000] tsc: Fast TSC calibration using PIT
[    0.000000] tsc: Detected 2591.996 MHz processor
[    0.013250] Calibrating delay loop (skipped), value calculated using timer frequency.. 5183.99 BogoMIPS (lpj=10367984)
[    0.013936] pid_max: default: 32768 minimum: 301
[    0.014300] ACPI: Core revision 20150930
[    0.038641] ACPI: 1 ACPI AML tables successfully acquired and loaded
[    0.040363] Security Framework initialized
[    0.040534] Yama: becoming mindful.
[    0.042522] AppArmor: AppArmor initialized
[    0.044789] Dentry cache hash table entries: 8192 (order: 4, 65536 bytes)
[    0.045312] Inode-cache hash table entries: 4096 (order: 3, 32768 bytes)
[    0.045770] Mount-cache hash table entries: 512 (order: 0, 4096 bytes)
[    0.045936] Mountpoint-cache hash table entries: 512 (order: 0, 4096 bytes)
[    0.061690] Initializing cgroup subsys io
[    0.062226] Initializing cgroup subsys memory
[    0.062686] Initializing cgroup subsys devices
[    0.062874] Initializing cgroup subsys freezer
[    0.063074] Initializing cgroup subsys net_cls
[    0.063230] Initializing cgroup subsys perf_event
[    0.063474] Initializing cgroup subsys net_prio
[    0.063623] Initializing cgroup subsys hugetlb
[    0.063778] Initializing cgroup subsys pids
[    0.221312] mce: CPU supports 10 MCE banks
[    0.228605] Last level iTLB entries: 4KB 512, 2MB 255, 4MB 127
[    0.228842] Last level dTLB entries: 4KB 512, 2MB 255, 4MB 127, 1GB 0
[    0.618583] Freeing SMP alternatives memory: 28K (ffffffff820b4000 - ffffffff820bb000)
[    0.650227] ftrace: allocating 31920 entries in 125 pages
[    0.712298] smpboot: Max logical packages: 1
[    0.712913] smpboot: APIC(0) Converting physical 0 to logical package 0
[    0.719765] ..TIMER: vector=0x30 apic1=0 pin1=2 apic2=-1 pin2=-1
[    0.760000] smpboot: CPU0: AMD EPYC Processor (family: 0x17, model: 0x1, stepping: 0x2)
[    0.760829] Performance Events: Broken PMU hardware detected, using software events only.
[    0.761517] Failed to access perfctr msr (MSR c0010007 is 0)
[    0.784848] x86: Booted up 1 node, 1 CPUs
[    0.785155] smpboot: Total of 1 processors activated (5183.99 BogoMIPS)
[    0.791995] NMI watchdog: disabled (cpu0): hardware events not enabled
[    0.792185] NMI watchdog: Shutting down hard lockup detector on all cpus
[    0.801830] devtmpfs: initialized
[    0.827223] evm: security.selinux
[    0.827378] evm: security.SMACK64
[    0.828022] evm: security.SMACK64EXEC
[    0.828113] evm: security.SMACK64TRANSMUTE
[    0.828202] evm: security.SMACK64MMAP
[    0.828283] evm: security.ima
[    0.828409] evm: security.capability
[    0.832681] clocksource: jiffies: mask: 0xffffffff max_cycles: 0xffffffff, max_idle_ns: 7645041785100000 ns
[    0.836343] pinctrl core: initialized pinctrl subsystem
[    0.842946] RTC time: 13:40:19, date: 09/05/21
[    0.852000] NET: Registered protocol family 16
[    0.860000] cpuidle: using governor ladder
[    0.860138] cpuidle: using governor menu
[    0.860339] PCCT header not found.
[    0.865912] ACPI: bus type PCI registered
[    0.866383] acpiphp: ACPI Hot Plug PCI Controller Driver version: 0.5
[    0.872363] PCI: Using configuration type 1 for base access
[    0.872532] PCI: Using configuration type 1 for extended access
[    0.905842] ACPI: Added _OSI(Module Device)
[    0.905983] ACPI: Added _OSI(Processor Device)
[    0.906055] ACPI: Added _OSI(3.0 _SCP Extensions)
[    0.906202] ACPI: Added _OSI(Processor Aggregator Device)
[    0.924000] ACPI: Interpreter enabled
[    0.924205] ACPI Exception: AE_NOT_FOUND, While evaluating Sleep State [\_S1_] (20150930/hwxface-580)
[    0.924845] ACPI Exception: AE_NOT_FOUND, While evaluating Sleep State [\_S2_] (20150930/hwxface-580)
[    0.928131] ACPI Exception: AE_NOT_FOUND, While evaluating Sleep State [\_S3_] (20150930/hwxface-580)
[    0.928439] ACPI Exception: AE_NOT_FOUND, While evaluating Sleep State [\_S4_] (20150930/hwxface-580)
[    0.928840] ACPI: (supports S0 S5)
[    0.928952] ACPI: Using IOAPIC for interrupt routing
[    0.929560] PCI: Using host bridge windows from ACPI; if necessary, use "pci=nocrs" and report a bug
[    0.960376] ACPI: PCI Root Bridge [PCI0] (domain 0000 [bus 00-ff])
[    0.960914] acpi PNP0A03:00: _OSC: OS supports [ExtendedConfig ASPM ClockPM Segments MSI]
[    0.964142] acpi PNP0A03:00: _OSC failed (AE_NOT_FOUND); disabling ASPM
[    0.969721] acpiphp: Slot [3] registered
[    0.970005] acpiphp: Slot [4] registered
[    0.970242] acpiphp: Slot [5] registered
[    0.970524] acpiphp: Slot [6] registered
[    0.970948] acpiphp: Slot [7] registered
[    0.972202] acpiphp: Slot [8] registered
[    0.972562] acpiphp: Slot [9] registered
[    0.972750] acpiphp: Slot [10] registered
[    0.973041] acpiphp: Slot [11] registered
[    0.973294] acpiphp: Slot [12] registered
[    0.973489] acpiphp: Slot [13] registered
[    0.973684] acpiphp: Slot [14] registered
[    0.973870] acpiphp: Slot [15] registered
[    0.974094] acpiphp: Slot [16] registered
[    0.974269] acpiphp: Slot [17] registered
[    0.974452] acpiphp: Slot [18] registered
[    0.974650] acpiphp: Slot [19] registered
[    0.974836] acpiphp: Slot [20] registered
[    0.975012] acpiphp: Slot [21] registered
[    0.975663] acpiphp: Slot [22] registered
[    0.976063] acpiphp: Slot [23] registered
[    0.976250] acpiphp: Slot [24] registered
[    0.976536] acpiphp: Slot [25] registered
[    0.976712] acpiphp: Slot [26] registered
[    0.976972] acpiphp: Slot [27] registered
[    0.977244] acpiphp: Slot [28] registered
[    0.977417] acpiphp: Slot [29] registered
[    0.977608] acpiphp: Slot [30] registered
[    0.977816] acpiphp: Slot [31] registered
[    0.978106] PCI host bridge to bus 0000:00
[    0.978324] pci_bus 0000:00: root bus resource [io  0x0000-0x0cf7 window]
[    0.978455] pci_bus 0000:00: root bus resource [io  0x0d00-0xffff window]
[    0.978573] pci_bus 0000:00: root bus resource [mem 0x000a0000-0x000bffff window]
[    0.978716] pci_bus 0000:00: root bus resource [mem 0x04000000-0xfebfffff window]
[    0.978940] pci_bus 0000:00: root bus resource [mem 0x100000000-0x17fffffff window]
[    0.979328] pci_bus 0000:00: root bus resource [bus 00-ff]
[    0.985254] pci 0000:00:01.1: legacy IDE quirk: reg 0x10: [io  0x01f0-0x01f7]
[    0.985559] pci 0000:00:01.1: legacy IDE quirk: reg 0x14: [io  0x03f6]
[    0.985685] pci 0000:00:01.1: legacy IDE quirk: reg 0x18: [io  0x0170-0x0177]
[    0.985804] pci 0000:00:01.1: legacy IDE quirk: reg 0x1c: [io  0x0376]
[    0.990617] pci 0000:00:01.3: quirk: [io  0x0600-0x063f] claimed by PIIX4 ACPI
[    0.990814] pci 0000:00:01.3: quirk: [io  0x0700-0x070f] claimed by PIIX4 SMB
[    1.025367] ACPI: PCI Interrupt Link [LNKA] (IRQs 5 *10 11)
[    1.026924] ACPI: PCI Interrupt Link [LNKB] (IRQs 5 *10 11)
[    1.028208] ACPI: PCI Interrupt Link [LNKC] (IRQs 5 10 *11)
[    1.029494] ACPI: PCI Interrupt Link [LNKD] (IRQs 5 10 *11)
[    1.030325] ACPI: PCI Interrupt Link [LNKS] (IRQs *9)
[    1.032698] ACPI: Enabled 2 GPEs in block 00 to 0F
[    1.038333] vgaarb: setting as boot device: PCI:0000:00:02.0
[    1.038710] vgaarb: device added: PCI:0000:00:02.0,decodes=io+mem,owns=io+mem,locks=none
[    1.038887] vgaarb: loaded
[    1.038995] vgaarb: bridge control possible 0000:00:02.0
[    1.042492] SCSI subsystem initialized
[    1.044600] ACPI: bus type USB registered
[    1.045219] usbcore: registered new interface driver usbfs
[    1.045551] usbcore: registered new interface driver hub
[    1.045925] usbcore: registered new device driver usb
[    1.049416] PCI: Using ACPI for IRQ routing
[    1.060500] NetLabel: Initializing
[    1.060605] NetLabel:  domain hash size = 128
[    1.060676] NetLabel:  protocols = UNLABELED CIPSOv4
[    1.061695] NetLabel:  unlabeled traffic allowed by default
[    1.063791] clocksource: Switched to clocksource refined-jiffies
[    1.133054] AppArmor: AppArmor Filesystem Enabled
[    1.134437] pnp: PnP ACPI init
[    1.139766] pnp: PnP ACPI: found 5 devices
[    1.164440] clocksource: acpi_pm: mask: 0xffffff max_cycles: 0xffffff, max_idle_ns: 2085701024 ns
[    1.164718] clocksource: Switched to clocksource acpi_pm
[    1.166311] NET: Registered protocol family 2
[    1.173093] TCP established hash table entries: 512 (order: 0, 4096 bytes)
[    1.173393] TCP bind hash table entries: 512 (order: 1, 8192 bytes)
[    1.173614] TCP: Hash tables configured (established 512 bind 512)
[    1.174282] UDP hash table entries: 256 (order: 1, 8192 bytes)
[    1.174489] UDP-Lite hash table entries: 256 (order: 1, 8192 bytes)
[    1.176064] NET: Registered protocol family 1
[    1.178924] pci 0000:00:00.0: Limiting direct PCI/PCI transfers
[    1.179236] pci 0000:00:01.0: PIIX3: Enabling Passive Release
[    1.179736] pci 0000:00:01.0: Activating ISA DMA hang workarounds
[    1.382176] ACPI: PCI Interrupt Link [LNKD] enabled at IRQ 11
[    1.599114] Trying to unpack rootfs image as initramfs...
[    1.903322] Freeing initrd memory: 4824K (ffff880003b15000 - ffff880003fcb000)
[    1.905413] Scanning for low memory corruption every 60 seconds
[    1.910096] futex hash table entries: 256 (order: 2, 16384 bytes)
[    1.910977] audit: initializing netlink subsys (disabled)
[    1.912213] audit: type=2000 audit(1630849219.907:1): initialized
[    1.916904] Initialise system trusted keyring
[    1.919899] HugeTLB registered 1 GB page size, pre-allocated 0 pages
[    1.920107] HugeTLB registered 2 MB page size, pre-allocated 0 pages
[    1.947613] zbud: loaded
[    1.950250] VFS: Disk quotas dquot_6.6.0
[    1.950843] VFS: Dquot-cache hash table entries: 512 (order 0, 4096 bytes)
[    1.976620] fuse init (API version 7.23)
[    1.979414] Key type big_key registered
[    1.979735] Allocating IMA MOK and blacklist keyrings.
[    1.983527] Key type asymmetric registered
[    1.983686] Asymmetric key parser 'x509' registered
[    1.984126] Block layer SCSI generic (bsg) driver version 0.4 loaded (major 249)
[    1.984940] io scheduler noop registered
[    1.985086] io scheduler deadline registered (default)
[    1.985959] io scheduler cfq registered
[    1.988073] pci_hotplug: PCI Hot Plug PCI Core version: 0.5
[    1.988540] pciehp: PCI Express Hot Plug Controller Driver version: 0.4
[    1.991133] input: Power Button as /devices/LNXSYSTM:00/LNXPWRBN:00/input/input0
[    1.991634] ACPI: Power Button [PWRF]
[    1.993557] GHES: HEST is not enabled!
[    2.186722] ACPI: PCI Interrupt Link [LNKC] enabled at IRQ 10
[    2.577249] ACPI: PCI Interrupt Link [LNKA] enabled at IRQ 10
[    2.843981] ACPI: PCI Interrupt Link [LNKB] enabled at IRQ 11
[    2.849454] Serial: 8250/16550 driver, 32 ports, IRQ sharing enabled
[    2.871901] 00:00: ttyS0 at I/O 0x3f8 (irq = 4, base_baud = 115200) is a 16550A
[    2.903820] Linux agpgart interface v0.103
[    2.904743] tsc: Refined TSC clocksource calibration: 2591.975 MHz
[    2.905054] clocksource: tsc: mask: 0xffffffffffffffff max_cycles: 0x255c9f48785, max_idle_ns: 440795331722 ns
[    2.982991] brd: module loaded
[    2.996688] loop: module loaded
[    3.123665] GPT:Primary header thinks Alt. header is not at the end of the disk.
[    3.123841] GPT:90111 != 2097151
[    3.123969] GPT:Alternate GPT header not at the end of the disk.
[    3.124163] GPT:90111 != 2097151
[    3.124339] GPT: Use GNU Parted to correct GPT errors.
[    3.124972]  vda: vda1 vda15
[    3.138031] scsi host0: ata_piix
[    3.139708] scsi host1: ata_piix
[    3.140521] ata1: PATA max MWDMA2 cmd 0x1f0 ctl 0x3f6 bmdma 0xc0e0 irq 14
[    3.140734] ata2: PATA max MWDMA2 cmd 0x170 ctl 0x376 bmdma 0xc0e8 irq 15
[    3.145464] libphy: Fixed MDIO Bus: probed
[    3.145689] tun: Universal TUN/TAP device driver, 1.6
[    3.145797] tun: (C) 1999-2004 Max Krasnyansky <maxk@qualcomm.com>
[    3.163713] PPP generic driver version 2.4.2
[    3.165037] ehci_hcd: USB 2.0 'Enhanced' Host Controller (EHCI) Driver
[    3.165279] ehci-pci: EHCI PCI platform driver
[    3.165548] ehci-platform: EHCI generic platform driver
[    3.165758] ohci_hcd: USB 1.1 'Open' Host Controller (OHCI) Driver
[    3.166059] ohci-pci: OHCI PCI platform driver
[    3.166304] ohci-platform: OHCI generic platform driver
[    3.166531] uhci_hcd: USB Universal Host Controller Interface driver
[    3.391548] uhci_hcd 0000:00:01.2: UHCI Host Controller
[    3.392036] uhci_hcd 0000:00:01.2: new USB bus registered, assigned bus number 1
[    3.392910] uhci_hcd 0000:00:01.2: detected 2 ports
[    3.393538] uhci_hcd 0000:00:01.2: irq 11, io base 0x0000c080
[    3.398192] usb usb1: New USB device found, idVendor=1d6b, idProduct=0001
[    3.398347] usb usb1: New USB device strings: Mfr=3, Product=2, SerialNumber=1
[    3.398513] usb usb1: Product: UHCI Host Controller
[    3.398617] usb usb1: Manufacturer: Linux 4.4.0-28-generic uhci_hcd
[    3.398733] usb usb1: SerialNumber: 0000:00:01.2
[    3.402335] hub 1-0:1.0: USB hub found
[    3.403072] hub 1-0:1.0: 2 ports detected
[    3.409427] i8042: PNP: PS/2 Controller [PNP0303:KBD,PNP0f13:MOU] at 0x60,0x64 irq 1,12
[    3.412533] serio: i8042 KBD port at 0x60,0x64 irq 1
[    3.412898] serio: i8042 AUX port at 0x60,0x64 irq 12
[    3.415572] mousedev: PS/2 mouse device common for all mice
[    3.418445] input: AT Translated Set 2 keyboard as /devices/platform/i8042/serio0/input/input1
[    3.420107] rtc_cmos 00:04: RTC can wake from S4
[    3.422352] rtc_cmos 00:04: rtc core: registered rtc_cmos as rtc0
[    3.422988] rtc_cmos 00:04: alarms up to one day, y3k, 242 bytes nvram
[    3.423243] i2c /dev entries driver
[    3.424202] device-mapper: uevent: version 1.0.3
[    3.425802] device-mapper: ioctl: 4.34.0-ioctl (2015-10-28) initialised: dm-devel@redhat.com
[    3.426425] ledtrig-cpu: registered to indicate activity on CPUs
[    3.430226] NET: Registered protocol family 10
[    3.447798] NET: Registered protocol family 17
[    3.448645] Key type dns_resolver registered
[    3.450959] microcode: CPU0: patch_level=0x01000065
[    3.451550] microcode: Microcode Update Driver: v2.01 <tigran@aivazian.fsnet.co.uk>, Peter Oruba
[    3.454143] registered taskstats version 1
[    3.454535] Loading compiled-in X.509 certificates
[    3.463020] Loaded X.509 cert 'Build time autogenerated kernel key: 6ea974e07bd0b30541f4d838a3b7a8a80d5ca9af'
[    3.464138] zswap: loaded using pool lzo/zbud
[    3.574644] Key type trusted registered
[    3.647554] Key type encrypted registered
[    3.647864] AppArmor: AppArmor sha1 policy hashing enabled
[    3.659719] ima: No TPM chip found, activating TPM-bypass!
[    3.662275] evm: HMAC attrs: 0x1
[    3.666284]   Magic number: 5:903:684
[    3.666625] mem full: hash matches
[    3.667247] rtc_cmos 00:04: setting system clock to 2021-09-05 13:40:22 UTC (1630849222)
[    3.669712] BIOS EDD facility v0.16 2004-Jun-25, 0 devices found
[    3.669897] EDD information not available.
[    3.747826] Freeing unused kernel memory: 1480K (ffffffff81f42000 - ffffffff820b4000)
[    3.748723] Write protecting the kernel read-only data: 14336k
[    3.749642] usb 1-1: new full-speed USB device number 2 using uhci_hcd
[    3.754669] Freeing unused kernel memory: 1860K (ffff88000182f000 - ffff880001a00000)
[    3.756967] Freeing unused kernel memory: 168K (ffff880001dd6000 - ffff880001e00000)

info: initramfs: up at 3.90
modprobe: module virtio_pci not found in modules.dep
modprobe: module virtio_blk not found in modules.dep
modprobe: module virtio_net not found in modules.dep
modprobe: module vfat not found in modules.dep
modprobe: module nls_cp437 not found in modules.dep
info: copying initramfs to /dev/vda1
info: initramfs loading root from /dev/vda1
info: /etc/init.d/rc.sysinit: up at 9.33
info: container: none
Starting logging: OK
modprobe: module virtio_pci not found in modules.dep
modprobe: module virtio_blk not found in modules.dep
modprobe: module virtio_net not found in modules.dep
modprobe: module vfat not found in modules.dep
modprobe: module nls_cp437 not found in modules.dep
WARN: /etc/rc3.d/S10-load-modules failed
Initializing random number generator... [   10.775304] random: dd urandom read with 14 bits of entropy available
done.
Starting acpid: OK
Starting network...
udhcpc (v1.23.2) started
Sending discover...
Sending discover...
Sending discover...
Usage: /sbin/cirros-dhcpc <up|down>
No lease, failing
WARN: /etc/rc3.d/S40-network failed
