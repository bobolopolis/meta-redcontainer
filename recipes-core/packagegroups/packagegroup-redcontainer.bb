SUMMARY = "Packages to build for red container"

inherit packagegroup

RDEPENDS_${PN} = " \
    apache2 \
    autoconf \
    autoconf-archive \
    automake \
    bash \
    bc \
    bison \
    bzip2 \
    ca-certificates \
    cmake \
    coreutils \
    cpio \
    curl \
    diffoscope \
    dropbear \
    ed \
    ell \
    file \
    findutils \
    flex \
    gawk \
    gcc \
    git \
    go \
    grep \
    gzip \
    htop \
    iptables \
    less \
    libarchive \
    libtool \
    libxml2 \
    lighttpd \
    lsb-release \
    lsof \
    m4 \
    make \
    mariadb \
    mc \
    meson \
    nano \
    nasm \
    nginx \
    ninja \
    openssh \
    opkg \
    opkg-utils \
    orc \
    patch \
    perl \
    pigz \
    pkgconf \
    postgresql \
    python3 \
    python3-jinja2 \
    python3-numpy \
    qemu \
    quilt \
    ruby \
    rsync \
    sed \
    strace \
    subversion \
    sudo \
    squashfs-tools \
    tar \
    unzip \
    util-linux \
    valgrind \
    vim \
    wget \
    which \
    xz \
    zip \
    zstd \
"
